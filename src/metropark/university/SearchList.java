/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metropark.university;

/**
 *
 * @author laksh
 */
public class SearchList {
    private String studentId;
    private int Module01;
    private int Module02;
    private int Module03;
    private int Module04;
    private int Module05;
    private int Module06;
    
    
    public SearchList(String studentId, int Module01, int Module02, int Module03, int Module04, int Module05, int Module06){
    this.studentId = studentId;
    this.Module01 = Module01;
    this.Module02 = Module02;
    this.Module03 = Module03;
    this.Module04 = Module04;
    this.Module05 = Module05;
    this.Module06 = Module06;
    
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @return the Module01
     */
    public int getModule01() {
        return Module01;
    }

    /**
     * @return the Module02
     */
    public int getModule02() {
        return Module02;
    }

    /**
     * @return the Module03
     */
    public int getModule03() {
        return Module03;
    }

    /**
     * @return the Module04
     */
    public int getModule04() {
        return Module04;
    }

    /**
     * @return the Module05
     */
    public int getModule05() {
        return Module05;
    }

    /**
     * @return the Module06
     */
    public int getModule06() {
        return Module06;
    }
    
    
    
}
