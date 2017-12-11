package com.t0lia.design_pattern.I_creational.prorotype;

/**
 * Create objects based on a template of an existing object through cloning.
 * The Prototype pattern should be considered when
 * <ul>
 * <li> Composition, creation and representation of objects should be decoupled from the system</li>
 * <li> Classes to be created are specified at runtime</li>
 * <li> You need to hide the complexity of creating new instance from the client</li>
 * <li> Creating an object is an expensive operation and it would be more efficient to copy an object.</li>
 * <li> Objects are required that are similar to existing objects.</li>
 * </ul>
 */
class CookieCutter implements Cloneable, Prototype{
    private final int size;
    private final CookieForm form;

    private String content;

    public CookieCutter setContent(String content) {
        this.content = content;
        return this;
    }

    public CookieCutter(int size, CookieForm form) {
        this.size = size;
        this.form = form;
    }

    @Override
    public String toString() {
        return "CookieCutter{" + "size=" + size + ", form=" + form + ", content='" + content + '\'' + '}';
    }

    @Override
    protected CookieCutter clone() throws CloneNotSupportedException {
        return (CookieCutter) super.clone();
    }
}
