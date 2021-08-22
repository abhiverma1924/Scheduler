package org.daypilot.demo.angularscheduler.repository;

import org.daypilot.demo.angularscheduler.domain.Resource;
import org.springframework.data.repository.CrudRepository;

public interface ResourceRepository extends CrudRepository<Resource, Long> {
}