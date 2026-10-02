// entry=0x6a7e8

void H6a7e8(ulong param_1)

{
  int iVar1;
  uint uVar2;
  byte bVar3;
  ulong unaff_x20;
  byte *unaff_x22;
  
  if ((param_1 & 1) == 0) {
                    /* WARNING: Could not recover jumptable at 0x0016ae00. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027a190)();
    return;
  }
  bVar3 = *unaff_x22;
  *unaff_x22 = 1 - (((byte)DAT_00283cb8 & 1 ^ 1) - 1 & 1) & 1;
  uVar2 = (uint)((bVar3 & 1) == 0);
  iVar1 = (DAT_0029e84c | uVar2) + (DAT_0029e84c & uVar2);
  if (DAT_0029e84c != (-(int)DAT_00283cb8 | 0x58495402U) * 2 - (-(int)DAT_00283cb8 ^ 0x58495402U)) {
    DAT_0029e610 = 0;
    DAT_0029e84c = iVar1;
                    /* WARNING: Could not recover jumptable at 0x0016aa0c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00274720)
              ((-DAT_00283cb8 ^ 0x7b82fa3b58495409U) + (-DAT_00283cb8 & 0x7b82fa3b58495409U) * 2 <
               unaff_x20);
    return;
  }
  DAT_0029e84c = iVar1;
  memcpy(&DAT_0027cb48,&DAT_0012cf90,0x400);
                    /* WARNING: Could not recover jumptable at 0x0016b7b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002748f8)
            ((-(int)DAT_00283cb8 | 0xbc85bcc9U) * 2 - (-(int)DAT_00283cb8 ^ 0xbc85bcc9U));
  return;
}


