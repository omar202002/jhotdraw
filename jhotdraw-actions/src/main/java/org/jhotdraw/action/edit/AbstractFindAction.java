/*
 * @(#)AbstractFindAction.java
 *
 * Copyright (c) 1996-2010 The authors and contributors of JHotDraw.
 * You may not use, copy or modify this file, except in compliance with the
 * accompanying license terms.
 */
package org.jhotdraw.action.edit;

import java.io.Serial;
import org.jhotdraw.action.AbstractViewAction;
import org.jhotdraw.api.app.Application;
import org.jhotdraw.api.app.View;
import org.jhotdraw.util.*;

/**
 * Presents a find dialog to the user and then highlights the found items in the active view.
 *
 * <p>This action is called when the user selects the Find item in the Edit menu. The menu item is
 * automatically created by the application.
 *
 * <p>If you want this behavior in your application, you have to create an action with this ID and
 * put it in your {@code ApplicationModel} in method {@link ApplicationModel#initApplication}.
 */
public abstract class AbstractFindAction extends AbstractViewAction {

  @Serial private static final long serialVersionUID = 1L;
  public static final String ID = "edit.find";

  public AbstractFindAction(Application app, View view) {
    super(app, view);
    ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.action.Labels");
    labels.configureAction(this, ID);
  }
}
