// entry=0x6067c

void thunk_FUN_00162bec(long param_1)

{
  long lVar1;
  ulong uVar2;
  long unaff_x22;
  long unaff_x25;
  
  lVar1 = (param_1 << 0x20) >> ((-DAT_00274ad0 | 0xfb9dU) + (-DAT_00274ad0 & 0xfb9dU) & 0x3f);
  uVar2 = -lVar1;
                    /* WARNING: Could not recover jumptable at 0x00162c6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027d4c0)
            [(long)(int)((-(int)DAT_00274ad0 | 0x1660fb7dU) + (-(int)DAT_00274ad0 & 0x1660fb7dU)) *
             0x5b])(unaff_x25 + 0x28,unaff_x22 + lVar1,(uVar2 | 0x400) + (uVar2 & 0x400));
  return;
}


