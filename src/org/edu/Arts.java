package org.edu;

public class Arts extends Education {
    public void BSC() {
    	System.out.println("BSC is UGcourse");
    	}
    public void bED() {
    	System.out.println("bED is UGcourse");
    	}
    public void BA() {
    	System.out.println("BA is UGcourse");
    	}
    public void BBA() {
    	System.out.println("BBA is UGcourse");
    	}
    
    public static void main(String[] args) {
    	Arts a = new Arts();
    			a.BSC();
    	a.bED();
    	a.BA();
    	a.BBA();
    	a.UG();
    }
    
}
