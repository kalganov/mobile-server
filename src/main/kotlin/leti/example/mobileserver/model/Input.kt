package leti.example.mobileserver.model

import org.hibernate.annotations.GenericGenerator
import java.time.ZonedDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "input_3")
class Input(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(
                name = "UUID",
                strategy = "org.hibernate.id.UUIDGenerator"
        )
        @Column(name = "id", updatable = false, nullable = false)
        val id: UUID,
        @Column(name = "user_id") val userId: String,
        @Column(name = "typing_speed") val typingSpeed: Long,
        @Column(name = "start_symbol") val startSymbol: Int,
        @Column(name = "end_symbol") val endSymbol: Int,
        @Column(name = "created_at") val createdAt: ZonedDateTime
)