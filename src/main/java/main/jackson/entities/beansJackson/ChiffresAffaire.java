
package main.jackson.entities.beansJackson;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "annee",
    "chiffreAffaire"
})
public class ChiffresAffaire {

    @JsonProperty("annee")
    private String annee;
    @JsonProperty("chiffreAffaire")
    private Double chiffreAffaire;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("annee")
    public String getAnnee() {
        return annee;
    }

    @JsonProperty("annee")
    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @JsonProperty("chiffreAffaire")
    public Double getChiffreAffaire() {
        return chiffreAffaire;
    }

    @JsonProperty("chiffreAffaire")
    public void setChiffreAffaire(Double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChiffresAffaire.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("annee");
        sb.append('=');
        sb.append(((this.annee == null)?"<null>":this.annee));
        sb.append(',');
        sb.append("chiffreAffaire");
        sb.append('=');
        sb.append(((this.chiffreAffaire == null)?"<null>":this.chiffreAffaire));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.chiffreAffaire == null)? 0 :this.chiffreAffaire.hashCode()));
        result = ((result* 31)+((this.annee == null)? 0 :this.annee.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChiffresAffaire) == false) {
            return false;
        }
        ChiffresAffaire rhs = ((ChiffresAffaire) other);
        return ((((this.chiffreAffaire == rhs.chiffreAffaire)||((this.chiffreAffaire!= null)&&this.chiffreAffaire.equals(rhs.chiffreAffaire)))&&((this.annee == rhs.annee)||((this.annee!= null)&&this.annee.equals(rhs.annee))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
