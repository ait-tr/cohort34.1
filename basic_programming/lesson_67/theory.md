Русский текст смотри ниже

Internet Protocol (IP) is a routed network layer protocol of the TCP/IP stack. It was IP that became the protocol that united individual computer networks into the worldwide Internet. An integral part of the protocol is network addressing

IP address is a unique numeric identifier of a device on a computer network operating over the IP protocol.

The Internet requires globally unique addresses; in the case of working on a local network, the uniqueness of the address within the network is required. In the IPv4 protocol version, the IP address is 4 bytes long, and in the IPv6 protocol version it is 16 bytes long.

TCP (Transmission Control Protocol) is one of the main Internet data transfer protocols. Designed to manage Internet data transfer. Packets in TCP are called segments.

TCP provides a connection-pre-established data stream, re-requests data in the event of data loss, and eliminates duplication when two copies of the same packet are received, thereby ensuring (unlike UDP) the integrity of the transmitted data and notifying the sender of the results of the transmission.

TCP implementations are usually built into OS kernels. There are TCP implementations that run in user space.

When transferring from computer to computer over the Internet, TCP operates at the top layer between two end systems, such as a browser and a web server. TCP reliably transfers a stream of bytes from one process to another.

Socket is the name of the software interface for ensuring data exchange between processes. Processes in such an exchange can be executed both on one computer and on different computers connected to each other only by a network. A socket is an abstract object that represents the end point of a connection.

A distinction must be made between client and server sockets. Client sockets can be roughly compared to end devices of a telephone network, and server sockets to switches. A client application (such as a browser) uses only client sockets, while a server application (such as a web server to which the browser sends requests) uses both client and server sockets.

The socket interface first appeared in BSD Unix. The socket programming interface is described in the POSIX.1 standard and is supported to one degree or another by all modern operating systems.

<br/>

Internet Protocol (IP, досл. «межсетевой протокол») — маршрутизируемый протокол сетевого уровня стека TCP/IP. Именно IP стал тем протоколом, который объединил отдельные компьютерные сети во всемирную сеть Интернет. Неотъемлемой частью протокола является адресация сети

IP-адрес (от англ. Internet Protocol) — уникальный числовой идентификатор устройства в компьютерной сети, работающей по протоколу IP.

В сети Интернет требуется глобальная уникальность адреса; в случае работы в локальной сети требуется уникальность адреса в пределах сети. В версии протокола IPv4 IP-адрес имеет длину 4 байта, а в версии протокола IPv6 — 16 байт.

TCP (англ. Transmission Control Protocol — протокол управления передачей) — один из основных протоколов передачи данных интернета. Предназначен для управления передачей данных интернета. Пакеты в TCP называются сегментами.

Механизм TCP предоставляет поток данных с предварительной установкой соединения, осуществляет повторный запрос данных в случае потери данных и устраняет дублирование при получении двух копий одного пакета, гарантируя тем самым (в отличие от UDP) целостность передаваемых данных и уведомление отправителя о результатах передачи.

Реализации TCP обычно встроены в ядра ОС. Существуют реализации TCP, работающие в пространстве пользователя.

Когда осуществляется передача от компьютера к компьютеру через Интернет, TCP работает на верхнем уровне между двумя конечными системами, например, браузером и веб-сервером. TCP осуществляет надёжную передачу потока байтов от одного процесса к другому.

Со́кет (англ. socket — разъём) — название программного интерфейса для обеспечения обмена данными между процессами. Процессы при таком обмене могут исполняться как на одной ЭВМ, так и на различных ЭВМ, связанных между собой только сетью. Сокет — абстрактный объект, представляющий конечную точку соединения.

Следует различать клиентские и серверные сокеты. Клиентские сокеты грубо можно сравнить с конечными аппаратами телефонной сети, а серверные — с коммутаторами. Клиентское приложение (например, браузер) использует только клиентские сокеты, а серверное (например, веб-сервер, которому браузер посылает запросы) — как клиентские, так и серверные сокеты.

Интерфейс сокетов впервые появился в BSD Unix. Программный интерфейс сокетов описан в стандарте POSIX.1 и в той или иной мере поддерживается всеми современными операционными системами.