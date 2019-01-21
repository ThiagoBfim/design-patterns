package br.org.project.design_patterns.behavior.templatemethod.pattern;

public abstract class ConnectionTemplate {

    public final void run() {
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }
    public abstract void setDBDriver();
    public abstract void setCredentials();
    protected void connect() {
        System.out.println("Setting connection...");
    }
    protected void prepareStatement() {
        System.out.println("Preparing insert statement...");
    }
    public abstract void setData();

    protected void insert() {
        System.out.println("Inserting data...");
    }
    protected void close() {
        System.out.println("Closing connections...");
    }
    protected void destroy() {
        System.out.println("Destroying connection objects...");
    }

}
