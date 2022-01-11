package org.pfe.dao;

import java.util.List;

import org.pfe.entities.Cours;
import org.pfe.entities.ReclamationEtudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ReclamationEtudiantRepository extends JpaRepository<ReclamationEtudiant, Long> {
	@Query("select r from ReclamationEtudiant r inner join r.professeur rp where rp.id=:id")
	public Page<ReclamationEtudiant> listCoursByprof(@Param("id")Long id,Pageable page);
	
	
	
	
	@Query("select r from ReclamationEtudiant r inner join r.etudiant rp where rp.id=:id")
	public List<ReclamationEtudiant> listRclmEtud(@Param("id")Long id_etud);

}
