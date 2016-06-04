## About pepXML

A Java API to the pepXML format file.

The API is used to parse pepXML file, the result of runnning proteomic search engine. It builds on JAXB lib and utilizes xxindex [https://github.com/PRIDE-Utilities/xxindex] to randomly read part of file. 




## How to use
The API can be imported to the project to provide access to read and write functionality for pepXML.

```
    pepXMLUnmarshaller unmarshaller = new pepXMLUnmarshaller(pepXMLFile);
    Iterator<SampleEnzyme> enzymes = um.getSampleEnzymes();
    
    String spectrumId = um.getSpectrumIDs().iterator().next();
    SpectrumQuery spectrum_1 = um.um.getSpectrumById(spectrumId);
    SpectrumQuery spectrum_2 = um.um.getSpectrumByIndex(1);
    
    


```

