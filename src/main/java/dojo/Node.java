// <summary>
// <copyright file="ArquetypeApplication.cs" company="Axity">
// This source code is Copyright Axity and MAY NOT be copied, reproduced,
// published, distributed or transmitted to or stored in any manner without prior
// written consent from Axity (www.axity.com).
// </copyright>
// </summary>
package dojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guillermo.segura@axity.com
 */
public class Node
{
  private String name;

  private List<Node> nodes;

  public Node()
  {
    nodes = new ArrayList<>();
  }

  /**
   * @return the name
   */
  public String getName()
  {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName( String name )
  {
    this.name = name;
  }

  /**
   * @return the nodes
   */
  public List<Node> getNodes()
  {
    return nodes;
  }

  /**
   * @param nodes the nodes to set
   */
  public void setNodes( List<Node> nodes )
  {
    this.nodes = nodes;
  }
  
  @Override
  public String toString() {
    
    StringBuilder sb = new StringBuilder(this.name +":");
    for(Node node : nodes) {
      sb.append( node.getName());
    }
    
    return sb.toString();
  }

}
