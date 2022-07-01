// <summary>
// <copyright file="ArquetypeApplication.cs" company="Axity">
// This source code is Copyright Axity and MAY NOT be copied, reproduced,
// published, distributed or transmitted to or stored in any manner without prior
// written consent from Axity (www.axity.com).
// </copyright>
// </summary>
package dojo;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author guillermo.segura@axity.com
 */
class FriendsTest
{

  private Set<Node> friends = new HashSet<>();

  @BeforeEach
  protected void init()
  {
    Map<String, List<String>> people = new HashMap<>();
    this.addFriend( people, "Matthew", "Luke" );
    this.addFriend( people, "Matthew", "Brent" );
    this.addFriend( people, "Matthew", "Michael" );
    this.addFriend( people, "Matthew", "David" );
    this.addFriend( people, "Matthew", "Maggie" );
    this.addFriend( people, "Matthew", "Tristan" );
  }

  private void addFriend( Map<String, List<String>> people, String person, String friend )
  {
    List<String> list;
    if( people.containsKey( person ) )
    {
      list = people.get( person );
    }
    else
    {
      list = new ArrayList<String>();
      people.put( person, list );
    }
    list.add( friend )
  }

  @Test
  void test()
  {
    fail( "Not yet implemented" );
  }

}
