package jornadadeaprendizagem.renault.models.entities

import jakarta.persistence.*
import jornadadeaprendizagem.renault.models.dtos.residual.RequestResidualDTO
import jornadadeaprendizagem.renault.models.dtos.residual.ResponseResidualDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "actions")
open class Residual (
    @Id
    @Column(name = "id")
    val id : UUID,

    @Column(name ="Probability_RR")
    val probability_RR : String,

    @Column(name ="impact_rr")
    val impact_RR : String,

    @Column(name ="Classification_RR")
    val classification_RR : String,

    @Column(name ="Action_RR")
    val action_RR : String,

    @Column(name ="Risk_RR")
    val risk_RR : String,

    @Column(name ="Date_Resolution")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val date_Resolution : Date?,

    @Column(name ="Status_RR")
    val status_RR : String){

    constructor(responseResidualDTO: ResponseResidualDTO) : this(
        id = UUID.randomUUID(),
        probability_RR = responseResidualDTO.probability_RR,
        impact_RR = responseResidualDTO.impact_RR,
        classification_RR  = responseResidualDTO.classification_RR ,
        action_RR = responseResidualDTO.action_RR,
        risk_RR = responseResidualDTO.risk_RR,
        date_Resolution = responseResidualDTO.date_Resolution,
        status_RR = responseResidualDTO.status_RR
    )

    constructor(requestResidualDTO: RequestResidualDTO) : this(
        id = UUID.randomUUID(),
        probability_RR = requestResidualDTO.probability_RR,
        impact_RR = requestResidualDTO.impact_RR,
        classification_RR  = requestResidualDTO.classification_RR ,
        action_RR = requestResidualDTO.action_RR,
        risk_RR = requestResidualDTO.risk_RR,
        date_Resolution = requestResidualDTO.date_Resolution,
        status_RR = requestResidualDTO.status_RR
    )
}