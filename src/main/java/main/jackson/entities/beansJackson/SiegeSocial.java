
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
    "nom",
    "montagne",
    "etat",
    "pays"
})
public class SiegeSocial {

    @JsonProperty("nom")
    private String nom;
    @JsonProperty("montagne")
    private String montagne;
    @JsonProperty("etat")
    private String etat;
    @JsonProperty("pays")
    private String pays;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nom")
    public String getNom() {
        return nom;
    }

    @JsonProperty("nom")
    public void setNom(String nom) {
        this.nom = nom;
    }

    @JsonProperty("montagne")
    public String getMontagne() {
        return montagne;
    }

    @JsonProperty("montagne")
    public void setMontagne(String montagne) {
        this.montagne = montagne;
    }

    @JsonProperty("etat")
    public String getEtat() {
        return etat;
    }

    @JsonProperty("etat")
    public void setEtat(String etat) {
        this.etat = etat;
    }

    @JsonProperty("pays")
    public String getPays() {
        return pays;
    }

    @JsonProperty("pays")
    public void setPays(String pays) {
        this.pays = pays;
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
        sb.append(SiegeSocial.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nom");
        sb.append('=');
        sb.append(((this.nom == null)?"<null>":this.nom));
        sb.append(',');
        sb.append("montagne");
        sb.append('=');
        sb.append(((this.montagne == null)?"<null>":this.montagne));
        sb.append(',');
        sb.append("etat");
        sb.append('=');
        sb.append(((this.etat == null)?"<null>":this.etat));
        sb.append(',');
        sb.append("pays");
        sb.append('=');
        sb.append(((this.pays == null)?"<null>":this.pays));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.montagne == null)? 0 :this.montagne.hashCode()));
        result = ((result* 31)+((this.nom == null)? 0 :this.nom.hashCode()));
        result = ((result* 31)+((this.etat == null)? 0 :this.etat.hashCode()));
        result = ((result* 31)+((this.pays == null)? 0 :this.pays.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SiegeSocial) == false) {
            return false;
        }
        SiegeSocial rhs = ((SiegeSocial) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.montagne == rhs.montagne)||((this.montagne!= null)&&this.montagne.equals(rhs.montagne))))&&((this.nom == rhs.nom)||((this.nom!= null)&&this.nom.equals(rhs.nom))))&&((this.etat == rhs.etat)||((this.etat!= null)&&this.etat.equals(rhs.etat))))&&((this.pays == rhs.pays)||((this.pays!= null)&&this.pays.equals(rhs.pays))));
    }

}
