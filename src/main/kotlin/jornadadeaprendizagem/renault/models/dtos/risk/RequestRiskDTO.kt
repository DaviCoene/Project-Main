package jornadadeaprendizagem.renault.models.dtos.action

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
        value = "RequestRiskDTO",
        description = "Request Data Transfer Object for Risk"
)
data class RequestRiskDTO (
        @JsonProperty("name_Risk")
        val name_Risk  : String,

        @JsonProperty("Type_Risk")
        val type_Risk : String,

        @JsonProperty("area_Responsability")
        val area_Responsability : String,

        @JsonProperty("date_Entry")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        val date_Entry : Date?,

        @JsonProperty("consequence")
        val consequence : String,

        @JsonProperty("project")
        val project : String,

        @JsonProperty("meltier")
        val meltier : String,

        @JsonProperty("jalon")
        val jalon : String,

        @JsonProperty("jalon_Future")
        val jalon_Future: String,

        @JsonProperty("probability_Risk")
        val probability_Risk : String,

        @JsonProperty("Impact_risk")
        val impact_risk: String,

        @JsonProperty("classification_Risk")
        val classification_Risk : String,

        @JsonProperty("impact_Renault")
        val impact_Renault: String,

        @JsonProperty("situation_Risk")
        val situation_Risk : String)
