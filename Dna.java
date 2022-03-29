/*
 * 문자열을 char배열에 넣은 다음 char배열에서 원하는 만큼의 char 요소를 뽑아
 * 뽑은 요소를 다시 문자열로 바꿔주어 원하는 문자열과 일치하면 카운트하는 코드.
 */

public class Dna {
	public static void main(String[] args) {
		
		String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
     char[] charArray = dna.toCharArray();
     char[] current = new char[4];
     int TAGG = 0;
     int CCAG = 0;
     int AGCC = 0;
     
     // char 요소를 4개씩 current배열에 담는 반복
     for (int i = 0; i < charArray.length - 3; i++) {
    	 for (int j = 0; j < current.length; j++) {
    		 current[j] = charArray[i + j];
    	 }
    	 String stringFromCharArr = new String(current); // current를 String으로 변
    	 
    	 // 문자열의 일치하면 해당 변수에 1씩 더해주는 조건
    	 switch (stringFromCharArr) {
    	 case "TAGG":
    		 TAGG += 1;
    		 break;
    	 case "CCAG":
    		 CCAG += 1;
    		 break;
    	 case "AGCC":
    		 AGCC += 1;
    		 break;
    	 }
     }
     System.out.println("TAGG: " + TAGG);
     System.out.println("CCAG: " + CCAG);
     System.out.println("AGCC: " + AGCC);
	}
}
