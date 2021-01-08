package org.appTd.Exceptions;

public class SQLNoRecordException extends Exception{
    public SQLNoRecordException() {
        super("No record found");
    }
}
