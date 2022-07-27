class Solution 
		{
			public ListNode removeElements(ListNode head, int val)
			{
				if(head==null)
					return head;
				ListNode dummy=new ListNode(0,head);
				ListNode preNode=dummy;
				ListNode currNode=head;

				while(currNode!=null)
				{
					if(currNode.val==val)
					{
						preNode.next=currNode.next;
					}
					else
					{
						preNode=preNode.next;
					}
					currNode=currNode.next;
				}
				return dummy.next;
			}
		}