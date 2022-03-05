package shirazisoftware.accessingdatajpa;

import java.util.List;

public interface BuddyService {
    List<BuddyInfo> findAll();

    void save(BuddyInfo buddy);
}
