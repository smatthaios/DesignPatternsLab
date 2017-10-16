package gr.regenerationcodingschool.composite;


public class CompositeMenuDemo {

	public static void main(String[] args) {
		
		MenuComposite mainMenuComposite = new MenuComposite("Main", "/main");
		
		MenuLeaf safetyMenuLeaf = new MenuLeaf("Safety", "/safety");
		
		mainMenuComposite.add(safetyMenuLeaf);
		
		MenuComposite claimsSubMenuComposite = new MenuComposite("Claims", "/claims");
		
		mainMenuComposite.add(claimsSubMenuComposite);
		
		MenuLeaf personalClaimsMenu = new MenuLeaf("Personal Claim", "/personalClaims");
		
		claimsSubMenuComposite.add(personalClaimsMenu);
		
		System.out.println(mainMenuComposite.toString());
	}
}
