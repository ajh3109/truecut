\T c:\1.txt
show variables like 'c%';
grant all privileges on *.* to truecut@localhost identified by 'security';
create database Truecutsecurity DEFAULT CHARACTER SET euckr COLLATE euckr_korean_ci;
ALTER DATABASE Truecutsecurity DEFAULT CHARACTER SET euckr COLLATE euckr_korean_ci;

set global innodb_large_prefix=on;
set global innodb_file_format=on;
set global innodb_large_prefix=on;
set global innodb_file_format=Barracuda;
\t