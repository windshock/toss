// entry=0x6c18c

void H6c18c(void)

{
  long lVar1;
  long unaff_x29;
  
  DAT_00278c88 = 0;
  DAT_00286318 = 0;
  CallSupervisor(0);
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) == *(long *)(unaff_x29 + -0x18)) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail((-DAT_00275930 | 0x5ddc6018f7e8b57aU) * 2 - (-DAT_00275930 ^ 0x5ddc6018f7e8b57aU)
                   ,&DAT_0027a318,
                   (-DAT_00275930 ^ 0x5ddc6018f7e8b5deU) + (-DAT_00275930 & 0x5ddc6018f7e8b5deU) * 2
                   ,(-DAT_00275930 | 0x5ddc6018f7e8b5deU) + (-DAT_00275930 & 0x5ddc6018f7e8b5deU));
}


