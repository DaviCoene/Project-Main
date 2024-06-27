package jornadadeaprendizagem.renault.models.entities

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import jornadadeaprendizagem.renault.models.dtos.action.RequestActionDTO
import jornadadeaprendizagem.renault.models.dtos.action.RequestRiskDTO
import jornadadeaprendizagem.renault.models.dtos.action.ResponseActionDTO
import jornadadeaprendizagem.renault.models.dtos.action.ResponseRiskDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "actions")
open class Risk (
    @Id
    @Column(name = "id")
    val id : UUID,

    @Column(name = "name_Risk")
    val name_Risk  : String,

    @Column(name = "Type_Risk")
    val type_Risk : String,

    @Column(name = "area_Responsability")
    val area_Responsability : String,

    @Column(name = "date_Entry")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val date_Entry : Date?,

    @Column(name = "consequence")
    val consequence : String,

    @Column(name = "project")
    val project : String,

    @Column(name = "meltier")
    val meltier : String,

    @Column(name = "jalon")
    val jalon : String,

    @Column(name = "jalon_Future")
    val jalon_Future: String,

    @Column(name = "probability_Risk")
    val probability_Risk : String,

    @Column(name = "Impact_risk")
    val impact_risk: String,

    @Column(name = "classification_Risk")
    val classification_Risk : String,

    @Column(name = "impact_Renault")
    val impact_Renault: String,

    @Column(name = "situation_Risk")
    val situation_Risk : String){

    constructor(responseRiskDTO : ResponseRiskDTO) : this(
        id = UUID.randomUUID(),
        name_Risk = responseRiskDTO.name_Risk,
        type_Risk = responseRiskDTO.type_Risk,
        area_Responsability = responseRiskDTO.area_Responsability,
        date_Entry = responseRiskDTO.date_Entry,
        consequence = responseRiskDTO.consequence,
        project  = responseRiskDTO.project ,
        meltier = responseRiskDTO.meltier,
        jalon = responseRiskDTO.jalon,
        jalon_Future = responseRiskDTO.jalon_Future,
        probability_Risk  = responseRiskDTO.probability_Risk ,
        classification_Risk = responseRiskDTO.classification_Risk,
        impact_risk = responseRiskDTO.impact_risk,
        impact_Renault = responseRiskDTO.impact_Renault,
        situation_Risk = responseRiskDTO.situation_Risk,
    )

    constructor(requestRiskDTO: RequestRiskDTO) : this(
        id = UUID.randomUUID(),
        name_Risk = requestRiskDTO.name_Risk,
        type_Risk = requestRiskDTO.type_Risk,
        area_Responsability = requestRiskDTO.area_Responsability,
        date_Entry = requestRiskDTO.date_Entry,
        consequence = requestRiskDTO.consequence,
        project  = requestRiskDTO.project ,
        meltier = requestRiskDTO.meltier,
        jalon = requestRiskDTO.jalon,
        jalon_Future = requestRiskDTO.jalon_Future,
        probability_Risk  = requestRiskDTO.probability_Risk ,
        classification_Risk = requestRiskDTO.classification_Risk,
        impact_risk = requestRiskDTO.impact_risk,
        impact_Renault = requestRiskDTO.impact_Renault,
        situation_Risk = requestRiskDTO.situation_Risk,
    )
}