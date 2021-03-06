
package main.jackson.entities.beansJackson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "siegeSocial",
    "fondateurs",
    "chiffresAffaire"
})
public class Societe {

    @JsonProperty("nom")
    private String nom;
    @JsonProperty("siegeSocial")
    private SiegeSocial siegeSocial;
    @JsonProperty("fondateurs")
    private List<Fondateur> fondateurs = new ArrayList<Fondateur>();
    @JsonProperty("chiffresAffaire")
    private List<ChiffresAffaire> chiffresAffaire = new ArrayList<ChiffresAffaire>();
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

    @JsonProperty("siegeSocial")
    public SiegeSocial getSiegeSocial() {
        return siegeSocial;
    }

    @JsonProperty("siegeSocial")
    public void setSiegeSocial(SiegeSocial siegeSocial) {
        this.siegeSocial = siegeSocial;
    }

    @JsonProperty("fondateurs")
    public List<Fondateur> getFondateurs() {
        return fondateurs;
    }

    @JsonProperty("fondateurs")
    public void setFondateurs(List<Fondateur> fondateurs) {
        this.fondateurs = fondateurs;
    }

    @JsonProperty("chiffresAffaire")
    public List<ChiffresAffaire> getChiffresAffaire() {
        return chiffresAffaire;
    }

    @JsonProperty("chiffresAffaire")
    public void setChiffresAffaire(List<ChiffresAffaire> chiffresAffaire) {
        this.chiffresAffaire = chiffresAffaire;
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
        sb.append(Societe.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nom");
        sb.append('=');
        sb.append(((this.nom == null)?"<null>":this.nom));
        sb.append(',');
        sb.append("siegeSocial");
        sb.append('=');
        sb.append(((this.siegeSocial == null)?"<null>":this.siegeSocial));
        sb.append(',');
        sb.append("fondateurs");
        sb.append('=');
        sb.append(((this.fondateurs == null)?"<null>":this.fondateurs));
        sb.append(',');
        sb.append("chiffresAffaire");
        sb.append('=');
        sb.append(((this.chiffresAffaire == null)?"<null>":this.chiffresAffaire));
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
        result = ((result* 31)+((this.chiffresAffaire == null)? 0 :this.chiffresAffaire.hashCode()));
        result = ((result* 31)+((this.fondateurs == null)? 0 :this.fondateurs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.siegeSocial == null)? 0 :this.siegeSocial.hashCode()));
        result = ((result* 31)+((this.nom == null)? 0 :this.nom.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Societe) == false) {
            return false;
        }
        Societe rhs = ((Societe) other);
        return ((((((this.chiffresAffaire == rhs.chiffresAffaire)||((this.chiffresAffaire!= null)&&this.chiffresAffaire.equals(rhs.chiffresAffaire)))&&((this.fondateurs == rhs.fondateurs)||((this.fondateurs!= null)&&this.fondateurs.equals(rhs.fondateurs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.siegeSocial == rhs.siegeSocial)||((this.siegeSocial!= null)&&this.siegeSocial.equals(rhs.siegeSocial))))&&((this.nom == rhs.nom)||((this.nom!= null)&&this.nom.equals(rhs.nom))));
    }

}
