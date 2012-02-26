package com.algaworks.highrisehq.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author duncan
 */
public class SubjectDatas {
    
    private String type = "array";
    private List<SubjectData> datas = new ArrayList<SubjectData>();

    @XmlElement(name="subject_data")
    public List<SubjectData> getDatas() {
        return datas;
    }

    public void setDatas(List<SubjectData> datas) {
        this.datas = datas;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void removeData(SubjectData subjectData) {
        for (Iterator<SubjectData> it = datas.iterator(); it.hasNext();) {
            SubjectData sd = it.next();
            if (sd.getFieldId().equals(subjectData.getFieldId())){
                sd.setId(-sd.getId());
                sd.setValue("");
            }
        }
    }
    
}
