package shirazisoftware.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuddyServiceImplement implements BuddyService {

    @Autowired
    private BuddyInfoRepository buddyInfoRepository;

    @Override
    public List<BuddyInfo> findAll() {
        return (List<BuddyInfo>) buddyInfoRepository.findAll();
    }

    @Override
    public void save(BuddyInfo buddy) {
        buddyInfoRepository.save(buddy);
    }
}
