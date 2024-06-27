package jornadadeaprendizagem.renault.modules.repositories

import models.entities.Action
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ActionRepository : JpaRepository<Action, UUID>