-- Create database Ja_Educore if it does not exist in our SQL Server instance.
IF NOT EXISTS (SELECT * FROM sys.databases WHERE name = 'Ja_Educore') CREATE DATABASE Ja_Educore;