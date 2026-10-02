// entry=0x3edc0

void H3e458(void)

{
  byte *pbVar1;
  uint uVar2;
  uint uVar3;
  undefined **ppuVar4;
  byte bVar5;
  byte bVar6;
  ulong in_x9;
  uint in_w10;
  uint in_w11;
  
  uVar2 = (in_w10 ^ 0xffffff00) & in_w10;
  uVar2 = (uVar2 | 1) + (uVar2 & 1);
  uVar3 = (in_w11 ^ 0xffffff00) & in_w11;
  pbVar1 = &stack0x000019f0 + ((uVar2 ^ 0xffffff00) & uVar2);
  bVar5 = *pbVar1;
  uVar2 = (uVar3 | bVar5) * 2 - (uVar3 ^ bVar5);
  *pbVar1 = (&stack0x000019f0)
            [(ulong)((uVar2 ^ 0xffffff00) & uVar2) +
             ((-DAT_00274488 ^ 0xf54cdd0dfa2e0b7fU) + (-DAT_00274488 & 0xf54cdd0dfa2e0b7fU) * 2) *
             0x100];
  (&stack0x000019f0)
  [(ulong)((uVar2 ^ 0xffffff00) & uVar2) +
   ((-DAT_00274488 ^ 0xf54cdd0dfa2e0b7fU) + (-DAT_00274488 & 0xf54cdd0dfa2e0b7fU) * 2) * 0x100] =
       bVar5;
  bVar6 = (*pbVar1 | bVar5) + (*pbVar1 & bVar5);
  bVar5 = (&DAT_00282790)[in_x9];
  (&DAT_00282790)[in_x9] = (bVar5 | bVar6) & (bVar5 & bVar6 ^ 0xff);
  ppuVar4 = &PTR_LAB_00280db0;
  if ((in_x9 | 1) + (in_x9 & 1) != 0x168) {
    ppuVar4 = &PTR_H3e458_00280578;
  }
                    /* WARNING: Could not recover jumptable at 0x0013e58c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar4)();
  return;
}


