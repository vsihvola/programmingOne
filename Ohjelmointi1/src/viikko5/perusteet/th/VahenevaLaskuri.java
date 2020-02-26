package viikko5.perusteet.th;

public class VahenevaLaskuri {
    private int arvo;   // oliomuuttuja joka muistaa laskurin arvon

    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
    }

    public void tulostaArvo() {
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
    	
    	if (this.arvo <= 0 ) {
    		return;
    	} else {
    		this.arvo = this.arvo - 1;
        	return;
        	
    	}
    	
        
    }
    
    public void nollaa () {
    	this.arvo = 0;
    	return;
    }

    
}