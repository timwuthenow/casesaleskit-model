package com.redhat.ba;

import java.util.ArrayList;
import java.util.List;


public class ProcessRequirements {

    private List<Step> steps;

    

    public void setSteps(final List<Step> steps) {
        this.steps = steps;
    }

    public void addStep(final Step step) {
        if(steps == null) {
            steps = new ArrayList<Step>();
        }

        steps.add(step);
    }

    public List<Step> getSteps() {
        return steps;
    }

    /**
     * 
     */
    public ProcessRequirements() {
    }

    /**
     * @param steps
     */
    public ProcessRequirements(List<Step> steps) {
        this.steps = steps;
    }

    
    
    
}
