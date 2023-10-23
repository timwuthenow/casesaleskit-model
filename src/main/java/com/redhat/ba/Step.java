package com.redhat.ba;

public class Step {

    private String name;
    private int sequenceNumber;
    private String sla;
    /**
     * @param name
     * @param sequenceNumber
     */
    public Step(String name, int sequenceNumber, String sla) {
        this.name = name;
        this.sequenceNumber = sequenceNumber;
        this.sla = sla;
    }

    public Step() {}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sequenceNumber
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * @param sequenceNumber the sequenceNumber to set
     */
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * @return the sla
     */
    public String getSla() {
        return sla;
    }

    /**
     * @param sla the sla to set
     */
    public void setSla(String sla) {
        this.sla = sla;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Step [name=" + name + ", sequenceNumber=" + sequenceNumber + ", sla=" + sla + "]";
    }

    
    
    
}
