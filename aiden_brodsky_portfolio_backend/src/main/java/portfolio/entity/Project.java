package portfolio.entity;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity //@Entity signifies that this is an entity class
@Table(name = "projects") //create the table for this entity in sql
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @NotBlank(message = "Project title is required dumbass!")
    @Column(name = "title", nullable = false)
    private String title;

    @NotBlank(message = "Project description is required dumbass!")
    @Column(name = "description", nullable = false, length = 2000)
    private String description;

    @ElementCollection
    @CollectionTable(name = "project_skills", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "skills", nullable = false)
    private List<String> skills;

    @ElementCollection
    @CollectionTable(name = "project_images", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "image_url")
    private List<String> imageUrls;

    @Column(name = "stl_url")
    private String stlFileUrl;

    //apparently a default constructor is required by JPA
    public Project() {}

    public Project(String title, String description, List<String> skills) {
        this.title = title;
        this.description = description;
        this.skills = skills;
    }

    public Project(String title, String description, List<String> skills, List<String> imageUrls) {
        this.title = title;
        this.description = description;
        this.skills = skills;
        this.imageUrls = imageUrls;
    }

    public Project(String title, String description, List<String> skills, List<String> imageUrls, String stlFileUrl) {
        this.title = title;
        this.description = description;
        this.skills = skills;
        this.imageUrls = imageUrls;
        this.stlFileUrl = stlFileUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getStlFileUrl() {
        return stlFileUrl;
    }

    public void setStlFileUrl(String stlFileUrl) {
        this.stlFileUrl = stlFileUrl;
    }
}
