package pl.dmichalski.webflow;

import java.util.ArrayList;
import java.util.List;

public class Project {

	private int id;

	private String name;

	private String description;

	private String creationTime;

    private String modificationTime;

	private List<Molecule> molecules;

	public Project(int id, String name, String description, String creationTime, String modificationTime) {
		this.id = id;
		this.description = description;
		this.creationTime = creationTime.substring(0, creationTime.length() - 3);
		this.modificationTime = modificationTime.substring(0, modificationTime.length() - 3);
		this.molecules = new ArrayList<Molecule>();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public String getModificationTime() {
		return modificationTime;
	}

	public List<Molecule> getMolecules() {
		return molecules;
	}

	public void addMolecule(Molecule molecule) {
		this.molecules.add(molecule);
	}

	public void removeMolecule(int index) {
		this.molecules.remove(index);
	}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Project{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", creationTime='").append(creationTime).append('\'');
        sb.append(", modificationTime='").append(modificationTime).append('\'');
        sb.append(", molecules=").append(molecules);
        sb.append('}');
        return sb.toString();
    }
}