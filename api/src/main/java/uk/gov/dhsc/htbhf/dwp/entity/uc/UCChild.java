package uk.gov.dhsc.htbhf.dwp.entity.uc;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Data
@Builder
@Table(name = "dwp_uc_child")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UCChild {

    @Id
    @Access(AccessType.PROPERTY)
    @EqualsAndHashCode.Include
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dwp_uc_household_id", nullable = false)
    private UCHousehold household;

    @Size(min = 1, max = 500)
    @Column(name = "forename")
    private String forename;

    @Size(min = 1, max = 500)
    @Column(name = "surname")
    private String surname;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "effective_date")
    private LocalDate effectiveDate;

    /**
     * Adding a custom getter for the id so that we can compare an entity before and after its initial
     * persistence and they will be the same.
     *
     * @return The id for the entity.
     */
    public UUID getId() {
        if (id == null) {
            this.id = UUID.randomUUID();
        }
        return this.id;
    }

}
