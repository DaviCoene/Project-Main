package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.dtos.ActionDTO
import jornadadeaprendizagem.renault.models.entities.Action
import jornadadeaprendizagem.renault.modules.providers.ActionProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ActionService (private val actionProvider: ActionProvider) {

    fun create(action: Action): ActionDTO = ActionDTO(actionProvider.create(action))

    //read
    fun findAll(): List<ActionDTO> {
        return actionProvider.findAll().map { action ->
            ActionDTO(action)}
    }

    //read
    fun findById(id: UUID): ActionDTO = ActionDTO(actionProvider.findById(id))

    fun update(id: UUID, action: Action): ActionDTO = ActionDTO(actionProvider.update(id, action))

    fun delete(id: UUID) = actionProvider.delete(id)
}