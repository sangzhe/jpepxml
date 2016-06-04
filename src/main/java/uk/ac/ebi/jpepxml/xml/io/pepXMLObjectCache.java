package uk.ac.ebi.jpepxml.xml.io;

import uk.ac.ebi.jpepxml.model.pepxml.pepXMLObject;

import java.util.List;


public interface pepXMLObjectCache {

    // ToDo: change to only handle pepXMLObjects
    // that way we make sure that the objects have an ID which identifies them!

    public void putInCache(String id, pepXMLObject object);

    public void putInCache(pepXMLObject element);

    public <T extends pepXMLObject> T getCachedObject(String id, Class<T> cls);

    public <T extends pepXMLObject> boolean hasEntry(Class<T> clazz);

    public <T extends pepXMLObject> List<T> getEntries(Class<T> clazz);

}
