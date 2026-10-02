// entry=0x6b6c4

void thunk_FUN_0016b730(void)

{
  uint uVar1;
  long lVar2;
  byte bVar3;
  ulong uVar4;
  byte *unaff_x23;
  
  lVar2 = 0;
  bVar3 = 0;
  do {
    unaff_x23[lVar2] = bVar3;
    lVar2 = lVar2 + 1;
    bVar3 = (bVar3 ^ 1) + (bVar3 & 1) * '\x02';
  } while (lVar2 != 0x100);
  bVar3 = *unaff_x23;
  uVar1 = (uint)(bVar3 | 0xdd) + (uint)(bVar3 & 0xdd);
  uVar4 = -DAT_00283cb8;
  *unaff_x23 = unaff_x23[(ulong)((uVar1 ^ 0xffffff00) & uVar1) +
                         ((uVar4 ^ 0x7b82fa3b58495402) + (uVar4 & 0x7b82fa3b58495402) * 2) * 0x100];
  unaff_x23[(ulong)((uVar1 ^ 0xffffff00) & uVar1) +
            ((uVar4 ^ 0x7b82fa3b58495402) + (uVar4 & 0x7b82fa3b58495402) * 2) * 0x100] = bVar3;
                    /* WARNING: Could not recover jumptable at 0x0016b9e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_0027c1c8)(0);
  return;
}


