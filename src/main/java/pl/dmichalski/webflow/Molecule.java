package pl.dmichalski.webflow;

public class Molecule {
	private int id;
	private String name, smiles;

	public Molecule(int id, String name, String smiles) {
		this.id = id;
		this.name = name;
		this.smiles = smiles;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSmiles() {
		return smiles;
	}

	@Override
	public String toString() {
		return "Molecule [id=" + id + ", name=" + name + ", smiles=" + smiles
				+ "]";
	}
}