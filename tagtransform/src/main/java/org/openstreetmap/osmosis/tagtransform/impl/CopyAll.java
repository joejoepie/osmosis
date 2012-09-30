// License: GPL. Copyright 2008 by Dave Stubbs and other contributors.
package org.openstreetmap.osmosis.tagtransform.impl;

import java.util.Collection;
import java.util.Map;

import org.openstreetmap.osmosis.tagtransform.Match;
import org.openstreetmap.osmosis.tagtransform.Output;


public class CopyAll implements Output {

	@Override
	public void apply(Map<String, String> originalTags,
			Map<String, String> tags, Collection<Match> matches) {
		// copy all tags
		tags.putAll(originalTags);
	}

}