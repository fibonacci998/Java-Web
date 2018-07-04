/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author tuans
 */
public class MyUnicode extends SimpleTagSupport {

    private int start;
    private int end;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");

            //capture structure of a jsp page
            JspContext pc=getJspContext();
            for (int i=start;i<=end;i++){
//                PageContext pg=(PageContext) pc;
//                HttpSession session=pg.getSession();
//                HttpServletRequest request=(HttpServletRequest) pg.getRequest();
                pc.setAttribute("i", i);
                pc.setAttribute("unicode", new Character((char)i));
                JspFragment f = getJspBody();
                if (f != null) {
                    f.invoke(out);
                }
            }
            
            

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
            // out.println("    </blockquote>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in MyUnicode tag", ex);
        }
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    
}
