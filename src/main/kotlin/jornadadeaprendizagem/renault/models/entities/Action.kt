package jornadadeaprendizagem.renault.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.Id
import jakarta.persistence.Table
import jornadadeaprendizagem.renault.models.dtos.ActionDTO
import jornadadeaprendizagem.renault.models.dtos.ResponsePilotDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "actions")
open class Action(
        @Id
        @Column(name = "id")
        val id: UUID,

        @Column(name = "estrategy")
        val estrategy: String,

        @Column(name = "desc_action")
        val desc_action: String,

        @Column(name = "ini_plain_action")
        val ini_plain_action: Date,

        @Column(name = "date_alert")
        val date_alert: Date,

        @Column(name = "time_resolution")
        val time_resolution: Float,

        @Column(name = "commentary")
        val commentary: String,

        @Column(name = "capitalization")
        val capitalization: String



) {
        constructor(actionDTO: ActionDTO) : this(

        id = UUID.randomUUID(),
        estrategy = actionDTO.estrategy,
        desc_action = actionDTO.desc_action,
        ini_plain_action = actionDTO.ini_plain_action,
        date_alert =  actionDTO.date_alert,
        time_resolution =  actionDTO.time_resolution,
        commentary =  actionDTO.commentary,
        capitalization =  actionDTO.capitalization



        )
}
