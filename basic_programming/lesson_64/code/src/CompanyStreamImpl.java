package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.model.SalesManager;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Predicate;

public class CompanyStreamImpl implements Company {
    private ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private Lock rLock = rwLock.readLock();
    private Lock wLock = rwLock.writeLock();
    private Set<Employee> employees;
    private int capacity;

    public CompanyStreamImpl(int capacity) {
        this.capacity = capacity;
        employees = new HashSet<>();
    }

    // O(1)
    @Override
    public boolean addEmployee(Employee employee) {
        wLock.lock();
        try {
            if (employee == null) {
                throw new RuntimeException("null");
            }
            if (capacity == employees.size()) {
                return false;
            }
            return employees.add(employee);
        } finally {
            wLock.unlock();
        }
    }

    // O(n)
    @Override
    public Employee removeEmployee(int id) {
        wLock.lock();
        try {
            Employee employee = findEmployee(id);
            employees.remove(employee);
            return employee;
        } finally {
            wLock.unlock();
        }
    }

    // O(n)
    @Override
    public Employee findEmployee(int id) {
        rLock.lock();
        try {
            return employees.stream()
                    .filter(e -> e.getId() == id)
                    .findFirst()
                    .orElse(null);
        } finally {
            rLock.unlock();
        }
    }

    // O(n)
    @Override
    public double totalSalary() {
        rLock.lock();
        try {
            return employees.stream()
                    .mapToDouble(e -> e.calcSalary())
                    .sum();
        } finally {
            rLock.unlock();
        }
    }

    // O(1)
    @Override
    public int quantity() {
        rLock.lock();
        try {
            return employees.size();
        } finally {
            rLock.unlock();
        }
    }

    // O(n)
    @Override
    public double totalSales() {
        rLock.lock();
        try {
            return employees.stream()
                    .filter(e -> e instanceof SalesManager)
                    .map(e -> (SalesManager) e)
                    .mapToDouble(s -> s.getSalesValue())
                    .summaryStatistics().getSum();
        } finally {
            rLock.unlock();
        }
    }

    // O(n)
    @Override
    public void printEmployees() {
        rLock.lock();
        try {
            employees.forEach(e -> System.out.println(e));
        } finally {
            rLock.unlock();
        }
    }

    // O(n)
    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e -> e.getHours() >= hours);
    }

    // O(n)
    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(e -> e.calcSalary() >= minSalary && e.calcSalary() < maxSalary);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
        rLock.lock();
        try {
            return employees.stream()
                    .filter(predicate)
                    .toArray(Employee[]::new);
        } finally {
            rLock.unlock();
        }
    }
}
