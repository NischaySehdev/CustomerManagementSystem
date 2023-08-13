package in.sarvshiksha.cms.logic;

import in.sarvshiksha.cms.datamodel.Concern;
import in.sarvshiksha.cms.datamodel.Issue;
import in.sarvshiksha.cms.utilities.Utilities;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 *
 * @author Nischay Sehdev
 */
public class CmsConfiguration {

    private final IndexPage indexPage;
    private final NewUser newUser;
    private final LoginPage login;
    private Session session;
    private final Issue issue;
    private final Agent agent;
    private final Supervisor supervisor;
    private final Utilities utilities;
    private final CmsInfoPage cmsInfoPage;
    private final SessionFactory sessionFactory;

    public CmsConfiguration() {
        indexPage = new IndexPage(this);
        newUser = new NewUser(this);
        login = new LoginPage(this);
        agent = new Agent(this);
        issue = new Issue(this);
        cmsInfoPage = new CmsInfoPage(this);
        supervisor = new Supervisor(this);
        utilities = new Utilities();

        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

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
        session = sessionFactory.openSession();
        session.beginTransaction();
        return session.get(classType, id);
    }

    public List<Concern> getObjectFromUsingQuery(String hqlQuery) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery(hqlQuery);
        return query.list();
    }

    public void setObject(Object object) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(object);
        session.flush();
        session.close();
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
