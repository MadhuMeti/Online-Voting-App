package com.example.onlinevoting;

public class CourseModal {

    // variables for our coursename,
    // id.
    private String candidateName;

    private int id;

    // creating getter and setter methods
    public String getcandidateName() { return candidateName; }

    public void setcandidateName(String candidateName)
    {
        this.candidateName = candidateName;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    // constructor
    public CourseModal(String candidateName)
    {
        this.candidateName = candidateName;
    }
}

