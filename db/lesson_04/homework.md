Русский текст смотри ниже

**Task 1**

SELECT s.*, ps.productID FROM suppliers s
    LEFT JOIN products_suppliers ps
    ON ps.supplierID = s.supplierID;

  redo it using RIGHT JOIN to get the same result
  
**Task 2**

SELECT p.*, ps.supplierID FROM products_suppliers ps
    RIGHT JOIN products p
    ON ps.productID = p.productID;

  redo it using LEFT JOIN to get the same result


**Задача 1**

SELECT s.*, ps.productID FROM suppliers s
    LEFT JOIN products_suppliers ps
    ON ps.supplierID = s.supplierID;

  переделать с использованием RIGHT JOIN, чтобы получился тот же результат

  
**Задача 2**

SELECT p.*, ps.supplierID FROM products_suppliers ps
    RIGHT JOIN products p
    ON ps.productID = p.productID;

  переделать с использованием LEFT JOIN, чтобы получился тот же результат