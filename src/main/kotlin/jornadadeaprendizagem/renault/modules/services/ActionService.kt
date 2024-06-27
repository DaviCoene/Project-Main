package jornadadeaprendizagem.renault.modules.services


import jornadadeaprendizagem.renault.modules.providers.ActionProvider
import models.dtos.action.RequestActionDTO
import models.dtos.action.ResponseActionDTO
import models.entities.Action
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ActionService (private val actionProvider: ActionProvider) {

    fun create(requestActionDTO: RequestActionDTO): ResponseActionDTO = ResponseActionDTO(actionProvider.create(Action((requestActionDTO))))

    //read
    fun findAll(): List<ResponseActionDTO> = actionProvider.findAll().map { ResponseActionDTO(it) }

    //read
    fun findById(id: UUID): ResponseActionDTO = ResponseActionDTO(actionProvider.findById(id))

    fun update(id: UUID, requestActionDTO: RequestActionDTO): ResponseActionDTO = ResponseActionDTO(actionProvider.update(id, Action(requestActionDTO)))

    fun delete(id: UUID) = actionProvider.delete(id)
}