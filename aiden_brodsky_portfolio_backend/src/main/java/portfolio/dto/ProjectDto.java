package portfolio.dto;

import java.util.List;

public class ProjectDto {
    private Long id;

    private String title;

    private String description;

    private List<String> skills;

    private List<String> imageUrls;

    private String stlFileUrl;

    public ProjectDto(String title, String description, List<String> skills) {
        this.title = title;
        this.description = description;
        this.skills = skills;
    }

    public ProjectDto(String title, String description, List<String> skills, List<String> imageUrls) {
        this.title = title;
        this.description = description;
        this.skills = skills;
        this.imageUrls = imageUrls;
    }

    public ProjectDto(String title, String description, List<String> skills, List<String> imageUrls, String stlFileUrl) {
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
