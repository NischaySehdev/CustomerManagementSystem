package in.sarvshiksha.cms.logic;

import in.sarvshiksha.cms.datamodel.Issue;
import in.sarvshiksha.cms.utilities.Utilities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Nischay Sehdev
 */
public class CmsConfiguration {

    private final IndexPage indexPage;
    private final NewUser newUser;
    private final LoginPage login;
    private final Session session;
    private final Issue issue;
    private final Agent agent;
    private final Supervisor supervisor;
    private final Utilities utilities;
    private final CmsInfoPage cmsInfoPage;

    public CmsConfiguration() {
        indexPage = new IndexPage(this);
        newUser = new NewUser(this);
        login = new LoginPage(this);
        agent = new Agent(this);
        issue = new Issue(this);
        cmsInfoPage = new CmsInfoPage(this);
        supervisor = new Supervisor(this);
        utilities = new Utilities();

        SessionFactory sessionFactory = new Configuration().buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    public static void main(String[] args) {
        new CmsConfiguration().init();
    }

    private void init() {
        java.awt.EventQueue.invokeLater(() -> {
            getIndexPage().setVisible(true);
        });
    }

    public Object getObjectFromSession(Class classType, String id) {
        return session.get(classType, id);
    }

    public void setObject(Object object) {
        session.save(object);
    }

    public void deleteObject(Class classType, String id) {

    }

    public IndexPage getIndexPage() {
        return indexPage;
    }

    public NewUser getNewUser() {
        return newUser;
    }

    public LoginPage getLogin() {
        return login;
    }

    public Agent getAgent() {
        return agent;
    }

    public Utilities getUtilities() {
        return utilities;
    }

    public Issue getIssue() {
        return issue;
    }

    public CmsInfoPage getCmsInfoPage() {
        return cmsInfoPage;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }
}
