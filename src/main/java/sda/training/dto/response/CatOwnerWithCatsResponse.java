package sda.training.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import sda.training.dto.CatDTO;
import sda.training.dto.CatOwnerDTO;

import java.util.List;

@JsonRootName("cat_owner_with_cats_response")
public class CatOwnerWithCatsResponse {

    @JsonProperty("cat_owner")
    private CatOwnerDTO catOwner;

    @JsonProperty("owned_cats")
    private List<CatDTO> ownedCats;

    public CatOwnerWithCatsResponse() {
    }

    public CatOwnerDTO getCatOwner() {
        return catOwner;
    }

    public void setCatOwner(CatOwnerDTO catOwner) {
        this.catOwner = catOwner;
    }

    public List<CatDTO> getOwnedCats() {
        return ownedCats;
    }

    public void setOwnedCats(List<CatDTO> ownedCats) {
        this.ownedCats = ownedCats;
    }
}
