package jornadadeaprendizagem.renault.models.dtos.action

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import org.springframework.format.annotation.DateTimeFormat
import jornadadeaprendizagem.renault.models.entities.Risk
import java.util.*

@ApiModel(
        value = "ResponseRiskDTO",
        description = "Response Data Transfer Object for Risk"
)
data class ResponseRiskDTO (
        @JsonProperty("id")
        val id : UUID,

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
 {
    constructor(risk: Risk) : this(
        id = UUID.randomUUID(),
        name_Risk = risk.name_Risk,
        type_Risk = risk.type_Risk,
        area_Responsability = risk.area_Responsability,
        date_Entry = risk.date_Entry,
        consequence = risk.consequence,
        project  = risk.project ,
        meltier = risk.meltier,
        jalon = risk.jalon,
        jalon_Future = risk.jalon_Future,
        probability_Risk  = risk.probability_Risk ,
        classification_Risk = risk.classification_Risk,
        impact_risk = risk.impact_risk,
        impact_Renault = risk.impact_Renault,
        situation_Risk = risk.situation_Risk,
    )
}