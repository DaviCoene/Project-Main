package jornadadeaprendizagem.renault.modules.repositories

import models.entities.Pilot
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PilotRepository : JpaRepository<models.entities.Pilot, UUID>