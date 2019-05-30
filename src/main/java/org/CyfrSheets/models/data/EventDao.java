package org.CyfrSheets.models.data;

import org.CyfrSheets.models.SEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EventDao extends CrudRepository<SEvent, Integer> {
}
